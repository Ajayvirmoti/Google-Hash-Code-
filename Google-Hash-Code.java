import java.util.*;

public class G_Hashcode_p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        Set Likes = new HashSet();
        Set DLikes = new HashSet();
        for (int i = 0; i<C; i++){
            int LN = sc.nextInt();

            for (int j = 0; j<LN; j++){
                Likes.add(sc.next());

            }
            int DN = sc.nextInt();
            for (int j = 0; j<DN; j++){
                DLikes.add(sc.next());
            }
        }
        Likes.addAll(DLikes);
        Likes.removeAll(DLikes);
        Iterator i = Likes.iterator();
        System.out.print(Likes.size() +" " );
        while (i.hasNext())
            System.out.print(i.next()+" ");
    }
}
