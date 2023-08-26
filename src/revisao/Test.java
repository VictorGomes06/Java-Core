package revisao;

public class Test {

	public static void main(String[] args) {

		Agenda minhaAgenda = new Agenda(null, null);
		minhaAgenda.setNome("Victor");
		minhaAgenda.setTelefone("81896-15065");
		minhaAgenda.addEmil("@gmail.com");
		minhaAgenda.addEndereco("Rua F");

		System.out.println(minhaAgenda.getNome() + "\n" + minhaAgenda.getTelefone() + "\n" + minhaAgenda.getEmail()
				+ "\n" + minhaAgenda.getEndereco());

	}

}
