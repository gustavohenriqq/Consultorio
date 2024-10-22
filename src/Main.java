import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcao = 0;

        do{
            System.out.println("MENU");
            System.out.println("1 - Cadastro de médicos");
            System.out.println("2 - Cadastro de pacientes");
            System.out.println("3 - Agendamentos");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            switch(opcao){
                case 1:
                    Medico.mostrarMedicos();
                    Medico.cadastrarMedico();
                    break;
                case 2:
                    Paciente.mostrarPacientes();
                    Paciente.cadastrarPaciente();
                    break;
                case 3:
                    //agendamento
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(opcao != 4);

    }
}