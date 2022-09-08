package metodos;

import static org.junit.Assert.assertTrue;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import drivers.DriversFactory;

public class Metodos extends DriversFactory {

	/**
	*Metodo para escrever em um elemento passando a class By
	*@param elemento
	*@param texto
	*@author Samuel	
	*/
	
	public void preencher (By elemento,String texto,String descricaoPasso) {
		
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
	    System.out.println("\r\n"
	    		+ ".----..----. .----.  .----.    .-. .-. .----.    .----.  .--.   .----. .----. .----. \r\n"
	    		+ "| {_  | {}  }| {}  }/  {}  \\   |  `| |/  {}  \\   | {}  }/ {} \\ { {__  { {__  /  {}  \\\r\n"
	    		+ "| {__ | .-. \\| .-. \\\\      /   | |\\  |\\      /   | .--'/  /\\  \\.-._} }.-._} }\\      /\r\n"
	    		+ "`----'`-' `-'`-' `-' `----'    `-' `-' `----'    `-'   `-'  `-'`----' `----'  `----' \r\n"
	    		+ ""+descricaoPasso);
			System.out.println(e.getCause());
		System.out.println(e.getMessage());
		}
	}
	
	/**
	 *Metodo para clicar em um elemento passando a class By
	 * @param elemento
	 * @param descricaoPasso
	 */
	
	public void clicar(By elemento, String descricaoPasso) {
	try {
		driver.findElement(elemento).click();
	} catch (Exception e) {
		System.out.println("\r\n"
	    		+ ".----..----. .----.  .----.    .-. .-. .----.    .----.  .--.   .----. .----. .----. \r\n"
	    		+ "| {_  | {}  }| {}  }/  {}  \\   |  `| |/  {}  \\   | {}  }/ {} \\ { {__  { {__  /  {}  \\\r\n"
	    		+ "| {__ | .-. \\| .-. \\\\      /   | |\\  |\\      /   | .--'/  /\\  \\.-._} }.-._} }\\      /\r\n"
	    		+ "`----'`-' `-'`-' `-' `----'    `-' `-' `----'    `-'   `-'  `-'`----' `----'  `----' \r\n"
	    		+ ""+descricaoPasso);
			System.out.println(e.getCause());
		System.out.println(e.getMessage());
	}	
	}
	public void uploadArquivo(String descricaoPasso){
		try {
		Robot robot = new Robot();
	robot.delay(1000);
		StringSelection ss = new StringSelection("C:\\Users\\Samuel\\Documents\\habilitacao.jpg");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.delay(1000);
	robot.keyRelease(KeyEvent.VK_V);
    robot.delay(1000);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	robot.delay(1000);
	
    }catch (Exception e) {
    	System.out.println("\r\n"
	    		+ ".----..----. .----.  .----.    .-. .-. .----.    .----.  .--.   .----. .----. .----. \r\n"
	    		+ "| {_  | {}  }| {}  }/  {}  \\   |  `| |/  {}  \\   | {}  }/ {} \\ { {__  { {__  /  {}  \\\r\n"
	    		+ "| {__ | .-. \\| .-. \\\\      /   | |\\  |\\      /   | .--'/  /\\  \\.-._} }.-._} }\\      /\r\n"
	    		+ "`----'`-' `-'`-' `-' `----'    `-' `-' `----'    `-'   `-'  `-'`----' `----'  `----' \r\n"
	    		+ ""+descricaoPasso);
			System.out.println(e.getCause());
		System.out.println(e.getMessage());
	}

}
public void validarTexto(By elemento, String textoDesejado,String descricaoPasso) {
try {
	String textoCapturado=driver.findElement(elemento).getText();
assertTrue(textoCapturado.contains(textoDesejado));
} catch (Exception e) {
	System.out.println("\r\n"
    		+ ".----..----. .----.  .----.    .-. .-. .----.    .----.  .--.   .----. .----. .----. \r\n"
    		+ "| {_  | {}  }| {}  }/  {}  \\   |  `| |/  {}  \\   | {}  }/ {} \\ { {__  { {__  /  {}  \\\r\n"
    		+ "| {__ | .-. \\| .-. \\\\      /   | |\\  |\\      /   | .--'/  /\\  \\.-._} }.-._} }\\      /\r\n"
    		+ "`----'`-' `-'`-' `-' `----'    `-' `-' `----'    `-'   `-'  `-'`----' `----'  `----' \r\n"
    		+ ""+descricaoPasso);
		System.out.println(e.getCause());
	System.out.println(e.getMessage());
}	
}
public void fecharNavegador() {
	driver.quit();
}
}


