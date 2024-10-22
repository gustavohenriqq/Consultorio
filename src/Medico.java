import java.util.Scanner;
import java.util.ArrayList;

class Medico {

    private int idMedico;
    private String nomeMedico;
    private String crm;
    private String especialidade;
    private String telefone;
    private String periodoAtendimento;

    private static ArrayList<Medico> listaMedicos = new ArrayList<Medico>();

    public Medico(){
    }

    public Medico(String nomeMedico, String crm, String especialidade, String telefone, String periodoAtendimento){
        this.nomeMedico = nomeMedico;
        this.crm = crm;
        this.especialidade = especialidade;
        this.telefone = telefone;
        this.periodoAtendimento = periodoAtendimento;
    }

    //getters e setters

    public static void cadastrarMedico(){
        Scanner entrada = new Scanner(System.in);

        //Medico novoMedico = new Medico();

        System.out.print("Digite o nome do médico: ");
        String nomeMedico = entrada.nextLine();
        System.out.print("Digite o CRM do médico: ");
        String crm = entrada.nextLine();
        System.out.print("Digite a especialidade do médico: ");
        String especialidade = entrada.nextLine();
        System.out.print("Digite o telefone do médico: ");
        String telefone = entrada.nextLine();
        System.out.print("Digite o período de atendimento do médico: ");
        String periodoAtendimento = entrada.nextLine();

        Medico novoMedico = new Medico(nomeMedico, crm, especialidade, telefone, periodoAtendimento);
        listaMedicos.add(novoMedico);

        System.out.println("Médico cadastrado com sucesso!");

    }

    public static void mostrarMedicos(){
        System.out.print("\n\n\nMÉDICOS CADASTRADOS: \n");
        System.out.println(listaMedicos.size());

        for(int i=0; i <listaMedicos.size() ; i++){
            System.out.print(listaMedicos.get(i).nomeMedico);
            System.out.print(" - " + listaMedicos.get(i).crm);
            System.out.print(" - " + listaMedicos.get(i).telefone);
            System.out.print(" - " + listaMedicos.get(i).especialidade);
            System.out.print(" - " + listaMedicos.get(i).periodoAtendimento);
        }

        System.out.println("\n\n\n");
    }

}