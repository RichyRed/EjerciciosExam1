package ej6Interpreter;

public class TerExpPara extends Traductor{
    public TerExpPara(int largo){
        this.largo =largo;
    }
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith(" ")){
            context.input = context.input.substring(1);
        }
        if (context.input.startsWith("Para")){
            context.output = context.output + "Then ";
            context.input = context.input.substring(largo);
        }
    }
}
