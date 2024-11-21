public class main {

    private static DAO dao = new DAO();

    public static String readByPosition(int index){
        return dao.getMyTeam().get(index);
    }

    public static void main(String[] args) {
        System.out.println(readByPosition(10));
    }
}
