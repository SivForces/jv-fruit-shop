package core.basesyntax.strategy;

import core.basesyntax.db.Storage;
import core.basesyntax.model.FruitTransaction;

public class SupplyHandler implements OperationHandler {
    @Override
    public void apply(FruitTransaction transaction) {
        String fruit = transaction.getFruit();
        int current = Storage.fruits.getOrDefault(fruit, 0);
        Storage.fruits.put(fruit, current + transaction.getQuantity());
    }
}
