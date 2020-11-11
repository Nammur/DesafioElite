/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafioelite.util;

import desafioelite.model.Empresa;
import desafioelite.model.EmpresaTableModel;
import desafioelite.model.Pessoa;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 *
 * @author Leonardo
 */
public class Utilidades {
    
    //retorna uma das empresas criadas previamente
    public Empresa gerarEmpresa(int index){
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Empresa e = new Empresa();
                
        if(index == 1){
            e.setCnpj("24.936.025/0001-60");
            e.setCodigo("01");
            e.setEmail("auditoria@noaheesteradvocacialtda.com.br");
            e.setInscricaoMunicipal("20.435-7");
            e.setRazaoSocial("Noah e Ester Advocacia Ltda");
            e.setTelefoneContato("84988276285");
            e.setStatus(1);
            e.setResponsavelLegal(new Pessoa("Noah", "840.746.150-45"));
            try {
                e.setDataInclusao(sdf.parse("27/02/2016"));
            } catch (ParseException ex ) {
                ex.printStackTrace();
            }
        }
        else if(index == 2){
            e.setCnpj("01.588.588/0001-09");
            e.setCodigo("36");
            e.setEmail("compras@daianeejoaolavanderiame.com.br");
            e.setInscricaoMunicipal("321.926.810.171");
            e.setRazaoSocial("Daiane e João Lavanderia ME");
            e.setTelefoneContato("(11) 99640-4363");
            e.setStatus(1);
            e.setResponsavelLegal(new Pessoa("Daiane", "965.132.490-23"));
            try {
                e.setDataInclusao(sdf.parse("04/12/2016"));
            } catch (ParseException ex ) {
                ex.printStackTrace();
            }
        }
        else if (index == 3){
            e.setCnpj("37.828.595/0001-88");
            e.setCodigo("48");
            e.setEmail("financeiro@antonellaeolivialocacoesdeautomoveisme.com.br");
            e.setInscricaoMunicipal("20.344.844-8");
            e.setRazaoSocial("Antonella e Olivia Locações de Automóveis ME");
            e.setTelefoneContato("(84) 99767-9528");
            e.setStatus(1);
            e.setResponsavelLegal(new Pessoa("Antone", "255.164.030-06"));
            try {
                e.setDataInclusao(sdf.parse("27/06/1996"));
            } catch (ParseException ex ) {
                ex.printStackTrace();
            }
        }
        else if(index == 4){
            e.setCnpj("53.876.325/0001-07");
            e.setCodigo("80");
            e.setEmail("tesouraria@esterebryancorretoresassociadosme.com.br");
            e.setInscricaoMunicipal("20.941.006-0");
            e.setRazaoSocial("Ester e Bryan Corretores Associados ME");
            e.setTelefoneContato("(84) 99894-6689");
            e.setStatus(2);
            e.setResponsavelLegal(new Pessoa("Bryan", "658.505.920-40"));
            try {
                e.setDataInclusao(sdf.parse("06/05/2000"));
            } catch (ParseException ex ) {
                ex.printStackTrace();
            }
        }
        else if(index == 5){
            e.setCnpj("55.947.826/0001-54");
            e.setCodigo("01");
            e.setEmail("juridico@ruaneamandacorretoresassociadosme.com.br");
            e.setInscricaoMunicipal("20.634.087-7");
            e.setRazaoSocial("Ruan e Amanda Corretores Associados ME");
            e.setTelefoneContato("(84) 98524-9022");
            e.setStatus(1);
            e.setResponsavelLegal(new Pessoa("Amanda", "224.396.750-24"));
            try {
                e.setDataInclusao(sdf.parse("19/02/1991"));
            } catch (ParseException ex ) {
                ex.printStackTrace();
            }
        }
        else if(index == 6){
            e.setCnpj("87.703.850/0001-34");
            e.setCodigo("34");
            e.setEmail("presidencia@biancaecalebepizzariame.com.br");
            e.setInscricaoMunicipal("460862-22");
            e.setRazaoSocial("Bianca e Calebe Pizzaria ME");
            e.setTelefoneContato("(75) 98100-0496");
            e.setStatus(2);
            e.setResponsavelLegal(new Pessoa("Bianca", "047.348.820-53"));
            try {
                e.setDataInclusao(sdf.parse("14/04/1995"));
            } catch (ParseException ex ) {
                ex.printStackTrace();
            }
        }
        else if(index == 7){
            e.setCnpj("33.262.613/0001-56");
            e.setCodigo("65");
            e.setEmail("sac@marcosealinefinanceiraltda.com.br");
            e.setInscricaoMunicipal("364249-75");
            e.setRazaoSocial("Marcos e Aline Financeira Ltda");
            e.setTelefoneContato("(71) 99918-6358");
            e.setStatus(2);
            e.setResponsavelLegal(new Pessoa("Marcos", "570.624.840-08"));
            try {
                e.setDataInclusao(sdf.parse("19/11/1995"));
            } catch (ParseException ex ) {
                ex.printStackTrace();
            }
        }
        else if(index == 8){
            e.setCnpj("24.963.050/0001-32");
            e.setCodigo("30");
            e.setEmail("juridico@bryanecarlacomerciodebebidasme.com.br");
            e.setInscricaoMunicipal("15796378-0");
            e.setRazaoSocial("Bryan e Carla Comercio de Bebidas ME");
            e.setTelefoneContato("(27) 3604-9532");
            e.setStatus(2);
            e.setResponsavelLegal(new Pessoa("Carla", "694.855.060-66"));
            try {
                e.setDataInclusao(sdf.parse("02/11/2004"));
            } catch (ParseException ex ) {
                ex.printStackTrace();
            }
        }
        else if(index == 9){
            e.setCnpj("28.782.066/0001-08");
            e.setCodigo("40");
            e.setEmail("posvenda@pietraerosaalimentosltda.com.br");
            e.setInscricaoMunicipal("81949200-0");
            e.setRazaoSocial("Pietra e Rosa Alimentos Ltda");
            e.setTelefoneContato("(27) 2914-8552");
            e.setStatus(2);
            e.setResponsavelLegal(new Pessoa("Pietra", "345.998.830-42"));
            try {
                e.setDataInclusao(sdf.parse("26/11/2004"));
            } catch (ParseException ex ) {
                ex.printStackTrace();
            }
        }
        else if(index == 10){
            e.setCnpj("30.977.745/0001-76");
            e.setCodigo("20");
            e.setEmail("ouvidoria@rafaeleenricotelecomunicacoesltda.com.br");
            e.setInscricaoMunicipal("54271424-8");
            e.setRazaoSocial("Rafael e Enrico Telecomunicações Ltda");
            e.setTelefoneContato("(27) 2970-9482");
            e.setStatus(1);
            e.setResponsavelLegal(new Pessoa("Rafael", "973.015.490-24"));
            try {
                e.setDataInclusao(sdf.parse("16/05/2004"));
            } catch (ParseException ex ) {
                ex.printStackTrace();
            }
        }
        else if(index == 11){
            e.setCnpj("64.831.189/0001-47");
            e.setCodigo("55");
            e.setEmail("contabil@otavioeluizesportesme.com.br");
            e.setInscricaoMunicipal("55134048-7");
            e.setRazaoSocial("Otávio e Luiz Esportes ME");
            e.setTelefoneContato("(27) 3781-8814");
            e.setStatus(1);
            e.setResponsavelLegal(new Pessoa("Otavio", "495.121.410-51"));
            try {
                e.setDataInclusao(sdf.parse("01/07/2004"));
            } catch (ParseException ex ) {
                ex.printStackTrace();
            }
        }
        else {
            e.setCnpj("48.530.505/0001-94");
            e.setCodigo("36");
            e.setEmail("fabricacao@emanuellyeninagraficaltda.com.br");
            e.setInscricaoMunicipal("95660446-3");
            e.setRazaoSocial("Emanuelly e Nina Gráfica Ltda");
            e.setTelefoneContato("(27) 2815-2418");
            e.setStatus(2);
            e.setResponsavelLegal(new Pessoa("Emanuelly", "020.673.420-45"));
            try {
                e.setDataInclusao(sdf.parse("06/01/2004"));
            } catch (ParseException ex ) {
                ex.printStackTrace();
            }
        }
        
        
        return e;
    }
    
    //exporta a jtable para um csv com caminho definido na chamada da função
    public static boolean exportToCSV(EmpresaTableModel tableToExport,
    String pathToExportTo) {

        try {

            try (FileWriter csv = new FileWriter(new File(pathToExportTo))) {
                for (int i = 0; i < tableToExport.getColumnCount(); i++) {
                    csv.write(tableToExport.getColumnNameExport(i) + ",");
                }

                csv.write("\n");

                for (int i = 0; i < tableToExport.getRowCount(); i++) {
                    for (int j = 0; j < tableToExport.getColumnCount(); j++) {
                        csv.write(tableToExport.getValueAtExport(i, j).toString() + ",");
                    }
                    csv.write("\n");
                }
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

}
