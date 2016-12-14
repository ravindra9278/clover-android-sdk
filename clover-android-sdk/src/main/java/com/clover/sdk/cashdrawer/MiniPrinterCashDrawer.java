package com.clover.sdk.cashdrawer;

import android.accounts.Account;
import android.content.Context;
import com.clover.sdk.util.CloverAccount;
import com.clover.sdk.util.Platform;
import com.clover.sdk.v1.printer.Category;
import com.clover.sdk.v1.printer.Printer;
import com.clover.sdk.v1.printer.Type;

import java.util.Collections;
import java.util.Set;

class MiniPrinterCashDrawer extends CashDrawer {
  static class Discovery extends CashDrawer.Discovery<MiniPrinterCashDrawer> {

    protected Discovery(Context context) {
      super(context);
    }

    @Override
    public Set<MiniPrinterCashDrawer> list() {
      if (!Platform.isCloverMini()) {
        return Collections.emptySet();
      }
      return Collections.singleton(new MiniPrinterCashDrawer(context));
    }
  }

  private final Account cloverAccount;
  private final Printer miniPrinter;

  protected MiniPrinterCashDrawer(Context context) {
    super(context, 1);
    this.cloverAccount = CloverAccount.getAccount(context);
    this.miniPrinter = new Printer.Builder().type(Type.SEIKO_MINI_USB).category(Category.RECEIPT).build();
  }

  @Override
  public boolean pop() {
    com.clover.sdk.v1.printer.CashDrawer.open(context, cloverAccount, miniPrinter);
    return true;
  }

  @Override
  public String toString() {
    return "MiniPrinterCashDrawer{" +
        "cloverAccount=" + cloverAccount +
        ", miniPrinter=" + miniPrinter +
        '}';
  }
}
