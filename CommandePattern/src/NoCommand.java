public class NoCommand  implements ICommand {
//    like a null object
    @Override
    public void execute() {
        System.out.println("No command");
    }

    @Override
    public void unexecute() {
        System.out.println("No command");
    }
}
