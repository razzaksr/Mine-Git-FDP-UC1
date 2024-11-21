import java.util.Scanner;
public class Main {

    private static DAO dao = new DAO();

    public static String readByPosition(int index){
        try{
            return dao.getMyTeam().get(index);
        }
        catch(IndexOutOfBoundsException exception){
            System.out.println("Enter the index less than "+dao.getMyTeam().size());
            Scanner scanner=new Scanner(System.in);
            return dao.getMyTeam().get(scanner.nextInt());
        }
    }

    public static void main(String[] args) {
        System.out.println(readByPosition(10));
    }
}
