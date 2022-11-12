package lotto.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    public String InputBuyAmount() {
        String buyAmount = readLine();
        return buyAmount;
    }

    public String InputWiningNumber() {
        String winingNumber = readLine();
        return winingNumber;
    }

    public int InputBonusNumber() {
        String bonusNumber = readLine();
        return Integer.parseInt(bonusNumber);
    }
}
