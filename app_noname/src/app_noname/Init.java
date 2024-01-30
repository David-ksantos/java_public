package app_noname;

public class Init {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.setStatus(true);
		System.out.println(aluno1.getStatus());
		aluno1.setNome("david");
		Aluno alunos[];
		alunos = new Aluno[100];
		int valor;
		valor = alunos[0].getMatricula();
		
		 int a[] = new int[10];
		 int i;
		 for(i=1;i<10;i++) {
			 a[i] = i*2;
			
			 System.out.println(a[i]);
		 }
		
	}

}
