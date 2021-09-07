public class Mexicano {
    String nombre;
    String ApPaterno;
    String ApMaterno;
    String fecha; //(formato DDMMYY)
    String sexo; //M o F
    String entidad;

    public Mexicano()
    {
        setNombre(CapturaEntrada.capturarCadena("Inserte el nombre (Mayusculas)"));
        setApPaterno(CapturaEntrada.capturarCadena("Inserte el apellido paterno (Mayusculas)"));
        setApMaterno(CapturaEntrada.capturarCadena("Inserte el apellido materno (Mayusculas)"));
        setFecha(CapturaEntrada.capturarCadena("Inserte fecha de nacimiento (AAMMDD)"));
        setSexo(CapturaEntrada.capturarCadena("Inserte sexo (H o M)"));
        setEntidad(CapturaEntrada.capturarCadena("Insertar clave de entidad de nacimiento (Mayusculas)"));
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApPaterno(String ApPaterno) {
        this.ApPaterno = ApPaterno;
    }
    public void setApMaterno(String ApMaterno) {
        this.ApMaterno = ApMaterno;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApPaterno() {
        return ApPaterno;
    }
    public String getApMaterno() {
        return ApMaterno;
    }
    public String getFecha() {
        return fecha;
    }
    public String getSexo() {
        return sexo;
    }
    public String getEntidad() {
        return entidad;
    }

    /*
    String nombre;
    String ApPaterno;
    String ApMaterno;
    String fecha; //(formato DDMMYY)
    String sexo; //M o F
    */



    public String obtenerCURP(String nombre, String ApPaterno, String ApMaterno, String fecha,String sexo, String entidad)
    {
        String returno = "";
        //Paso 1 primera letra del apellido
        returno = returno + ApPaterno.charAt(0);
        int j = 0;
        for(j=0;j<ApPaterno.length();j++)
        {
            if (ApPaterno.charAt(j) == 'A' || ApPaterno.charAt(j) == 'E' || ApPaterno.charAt(j) == 'I' || ApPaterno.charAt(j) == 'O' || ApPaterno.charAt(j) == 'U')
            {
                returno = returno + ApPaterno.charAt(j);
                break;
            }
        }
        returno = returno + ApMaterno.charAt(0);
        returno = returno + nombre.charAt(0);


        returno = returno + fecha;

        returno = returno + sexo;
        returno = returno + entidad;

        int veces = 0;
        for(j=0;j<ApPaterno.length();j++) {
            if (ApPaterno.charAt(j) != 'A' && ApPaterno.charAt(j) != 'E' && ApPaterno.charAt(j) != 'I' && ApPaterno.charAt(j) != 'O' && ApPaterno.charAt(j) != 'U') {
                if (veces == 1) {
                    returno = returno + ApPaterno.charAt(j);
                    break;
                }
                else
                {
                    veces = veces + 1;
                }
            }
        }

        veces = 0;
        for(j=0;j<ApMaterno.length();j++) {
            if (ApMaterno.charAt(j) != 'A' && ApMaterno.charAt(j) != 'E' && ApMaterno.charAt(j) != 'I' && ApMaterno.charAt(j) != 'O' && ApMaterno.charAt(j) != 'U') {
                if (veces == 1) {
                    returno = returno + ApMaterno.charAt(j);
                    break;
                }
                else
                {
                    veces = veces + 1;
                }
            }
        }

        veces = 0;
        for(j=0;j<nombre.length();j++) {
            if (nombre.charAt(j) != 'A' && nombre.charAt(j) != 'E' && nombre.charAt(j) != 'I' && nombre.charAt(j) != 'O' && nombre.charAt(j) != 'U') {
                if (veces == 1) {
                    returno = returno + nombre.charAt(j);
                    break;
                }
                else
                {
                    veces = veces + 1;
                }
            }
        }

        double aleatorio = Math.random();
        int entero = (int)(aleatorio);
        returno = returno + Integer.toString(entero);
        entero = (int)(aleatorio * 5);
        returno = returno + Integer.toString(entero);
        entero = (int)(aleatorio * 5 / 2);
        returno = returno + Integer.toString(entero);


        //REVISION DE PALABRAS MALAS
        String cuatroLetras = "";
        cuatroLetras = cuatroLetras + returno.charAt(0) + returno.charAt(1) + returno.charAt(2) + returno.charAt(3);

        //Aqui se puede agregar la blacklist de palabrotas. Por pudor no agregare mas que las que puso pero ya se imaginará.
        if (cuatroLetras.equals("VACA") || cuatroLetras.equals("COLA"))
        {
            for(j=0;j<cuatroLetras.length();j++)
            {
                if (returno.charAt(j) == 'A' || returno.charAt(j) == 'E' || returno.charAt(j) == 'I' || returno.charAt(j) == 'O' || returno.charAt(j) == 'U')
                {
                    returno = returno.substring(0, j) + "X" + returno.substring(j+1);
                    break;
                }
            }
        }

        return returno;
    }

    public String obtenerRFC(String nombre, String ApPaterno, String ApMaterno, String fecha,String sexo, String entidad)
    {
        String returno = "";
        //Paso 1 primera letra del apellido
        returno = returno + ApPaterno.charAt(0);
        int j = 0;
        for(j=0;j<ApPaterno.length();j++)
        {
            if (ApPaterno.charAt(j) == 'A' || ApPaterno.charAt(j) == 'E' || ApPaterno.charAt(j) == 'I' || ApPaterno.charAt(j) == 'O' || ApPaterno.charAt(j) == 'U')
            {
                returno = returno + ApPaterno.charAt(j);
                break;
            }
        }
        returno = returno + ApMaterno.charAt(0);
        returno = returno + nombre.charAt(0);

        returno = returno + fecha;

        double aleatorio = Math.random();
        int entero = (int)(aleatorio);
        returno = returno + Integer.toString(entero);
        entero = (int)(aleatorio * 5);
        returno = returno + Integer.toString(entero);
        entero = (int)(aleatorio * 5 / 2);
        returno = returno + Integer.toString(entero);


        return returno;
    }

    public String getRFC()
    {
        return obtenerRFC(nombre, ApPaterno, ApMaterno, fecha, sexo, entidad);
    }

    public String getCURP()
    {
        return obtenerCURP(nombre, ApPaterno, ApMaterno, fecha, sexo, entidad);
    }

}