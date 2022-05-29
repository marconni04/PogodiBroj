import java.util.Scanner;

class PogodiBroj{
    public static void main(String[] args){
        int zamisljenBroj;
        int pokusanBroj;
        boolean pogodak;
        Scanner tastatura = new Scanner(System.in);
        
        zamisljenBroj = (int)(100 * Math.random()) + 1;
        pogodak = false;
        
        System.out.println("Zamislio sam ceo broj 1 - 100");
        System.out.println("Pokusajte da ga pogodite:");
        
        while(!pogodak){
            System.out.println("Pogodite broj:");
            pokusanBroj = tastatura.nextInt();
            
            if(pokusanBroj < zamisljenBroj)
                System.out.println("Zamislio sam veci broj.");
            else if(pokusanBroj > zamisljenBroj)
                System.out.println("Zamislio sam manji broj");
            else{
                System.out.println("POGODAK! CESTITAM!");
                pogodak = true;
            }
        }
    }
}
