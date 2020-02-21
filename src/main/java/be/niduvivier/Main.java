package be.niduvivier;

import be.niduvivier.utils.Interactor;
import be.niduvivier.utils.Partial;

public class Main {
    public static void main(String[] args) {

        Partial.include("aaaa", (selector) -> {

            Interactor.click(selector);
            return null;
        });
    }
}
