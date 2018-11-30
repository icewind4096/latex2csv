package com.company;

import java.io.*;

/**
 * Created by MMNJ002 on 2018/11/30.
 */
public class ipTex {
    private String fileName;
    private com.company.ipInfo ipInfo;

    public ipTex(String fileName, com.company.ipInfo ipInfo) {
        this.fileName = fileName;
        this.ipInfo = ipInfo;
    }

    public void getIPInfo() {
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(new FileInputStream(fileName), "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String lineText = null;
            while ((lineText = bufferedReader.readLine()) != null){
                if (isRegisterSection(lineText.trim()) == true){
                    ipFileList.put(pickIPNameFromText(lineText), lineText.trim());
                }
            }
            return true;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
    public boolean isSourceFile(String content) {
        Pattern pattern = Pattern.compile("\\\\include\\{src/[A-Za-z&]+/[Mm][ZzTt][0-9]+_MM32[A-Za-z0-9&]+_[A-Za-z0-9&_]+}");
        return pattern.matcher(content).matches();
    }

    private String pickIPNameFromText(String lineText) {
        return lineText.substring(lineText.lastIndexOf("_") + 1, lineText.lastIndexOf("}")).trim();
    }

    public boolean getIPList(HashMap<String, String> ipFileList){
    }

\regOverview{ADC寄存器概览}{

		0x00       &ADC\_ADDATA      &A/D数据寄存器                         &0x00000000   &\autoref{subsubsec:ADC_ADDATA} \\ \hline
		0x04       &ADC\_ADCFG       &A/D 配置寄存器                        &0x00000000   &\autoref{subsubsec:ADC_ADCFG} \\ \hline
		0x08       &ADC\_ADCR        &A/D控制寄存器                         &0x00000000   &\autoref{subsubsec:ADC_ADCR} \\ \hline
		0x0C       &ADC\_ADCHS       &A/D通道选择寄存器                       &0x00000000   &\autoref{subsubsec:ADC_ADCHS} \\ \hline
		0x10       &ADC\_ADCMPR      &A/D窗口比较寄存器                       &0x00000000   &\autoref{subsubsec:ADC_ADCMPR} \\ \hline
		0x14       &ADC\_ADSTA       &A/D状态寄存器                         &0x00000000   &\autoref{subsubsec:ADC_ADSTA} \\ \hline

		0x18 $\sim$ 0x54      &ADC\_ADDR0 $\sim$ 15   &A/D数据寄存器                         &0x00000000   &\autoref{subsubsec:ADC_ADDR} \\	\hline
		0x58                 &ADC\_ADSTA\_EXT        &A/D扩展状态寄存器                     &0x00000000   &\autoref{subsubsec:ADC_ADSTA_EXT} \\


}
 */