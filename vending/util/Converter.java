package com.company.vending.util;

import com.company.vending.model.Type;

public class Converter {
    public static Command convertInput(Command command){
        String[] split = command.getCommand().split(":");
        command.setQuantity(Integer.parseInt(split[2]));
        command.setColumn(Integer.parseInt(split[1]));
        extractType(command, split);
        return command;
    }
    private static void extractType(Command command, String[] split) {
        switch (split[0]) {
            case "D":
                command.setType(Type.DRINKS);
                break;
            case "c":
                command.setType(Type.CHIPS);
                break;
            case "C":
                command.setType(Type.CHOCOLATE);
                break;
            case "S":
                command.setType(Type.SANDWICHES);
        }
    }
}
