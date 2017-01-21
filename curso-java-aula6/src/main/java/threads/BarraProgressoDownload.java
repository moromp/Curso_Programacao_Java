package threads;

import java.text.MessageFormat;

public class BarraProgressoDownload implements Runnable{

	private static final String MESSAGE = "Baixando {0} de {1} do arquivo {2}";
	private download download;
	private int contador;
	
	public BarraProgressoDownload(download download){
		this.download = download;
	}
	
	public void run() {
		
		try{
			while(!download.finalizado()){
				int cont = download.getContador();
				Object monitor = download.getMonitorProgresso();
				
				synchronized (monitor) {
					monitor.wait(5000);
				}
				
				if(cont == 0){
					System.out.println("Nao teve download");
				}
				else{
					String mensagem = MessageFormat.format(MESSAGE,
							download.getContador(),
							download.getTamanho(),
							download.getNomeArquivo());
					
					System.out.println(mensagem);
				}
			}
		}catch(InterruptedException e){
			throw new RuntimeException(e);
		}		
	}
}
