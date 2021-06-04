import java.util.Scanner;

public class Disciplina {
    
    Aluno[] aluno = new Aluno[10];
    
    public void add_alu(){
        aluno[1] = new Aluno();
        aluno[1].nota1 = 2.5;
        aluno[1].nota2 = 8;
        aluno[1].alt_nome("PAULO");

        aluno[2] = new Aluno();
        aluno[2].nota1 = 7; 
        aluno[2].nota2 = 8;
        aluno[2].alt_nome("ANDRE");

        aluno[3] = new Aluno();
        aluno[3].nota1 = 5; 
        aluno[3].nota2 = 3;
        aluno[3].alt_nome("CARLOS");
    }

    public void media_notas(){
       
        int i = 0;
        int n = 0;
        double m1 = 0;
        double m2 = 0;

        while (i < 9){
            i = i + 1;
            if (aluno[i] != null){
                n = n +1;
                m1 = m1 + aluno[i].nota1;
                m2 = m2 + aluno[i].nota2; 
            }
        }
        System.out.println( m1/n );
        System.out.println( m2/n);
    }

    public void entrada(){
        Scanner ler = new Scanner(System.in);
        int a=ler.nextInt();
        if (aluno[a-1] != null){
        aluno[a-1].imp_nome();
        }if(aluno[a+1] != null){
        aluno[a+1].imp_nome();
        }
    }
}


