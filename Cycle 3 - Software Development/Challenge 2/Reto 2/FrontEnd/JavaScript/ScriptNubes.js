// Nota: Para llamar las variables o botones desde el html usamos el numeral antes de la variable.

function LeerNube()
{
    //Llamado AJAX
    $.ajax
    (
        { 
        //Url de la base de datos.
        url : 'https://g8bd4ed023d5ff8-basededatostic.adb.sa-saopaulo-1.oraclecloudapps.com/ords/admin/cloud/cloud',
        //Tipo de peticion que vamos a usar en este caso GET.
        type : 'GET',
        //Tipo de dato que acepta el ajax, en este caso JSON.
        dataType : 'json',
            //Que va a hacer si los datos que recibe son correctos
            success : function(Nubes) 
            {
                //Creacion de los items de la instancia clientes
                let ns=Nubes.items;
                //Instruccion para vaciar los campos de la lista de clientes
                $("#ListaNubes").empty();
                //Ciclo para recorrer todas las instancias de la base de datos.
                for(i=0;i<ns.length;i++)
                {
                    //Instruccion para agregar en la pagina web la informacion del div en este caso
                    //El ID, el nombre y el email.
                    $("#ListaNubes").append("<b>" + ns[i].id + "</b> " + "<b>" + ns[i].brand + "</b> "
                    + "<b>" + ns[i].model + "</b> " + "<b>" + ns[i].category_id + "</b> "
                    + "<b>" + ns[i].name + "</b>");

                    //Instruccion para crear los botones de borrar justo al lado de la informacion del cliente.
                    $("#ListaNubes").append(" <button onclick='BorrarNube("+ns[i].id+")'>Borrar</button><br>");
                }
            },
            // En caso de fallar con la recepcion de los datos emite esta alerta.
            error : function() 
            {
            alert('ha sucedido un problema');
            },
            // En caso de completar las operaciones coloca el siguiente mensaje.
            complete : function() 
            {
            alert('Se muestran las Nubes');
            }
        }
    );
}

function GuardarNube()
{
    // Creacion de las variables que se van a recibir desde el html.
    let idNube =$("#IdNube").val();
    let MarcaNube =$("#MarcaNube").val();
    let ModeloNube =$("#ModeloNube").val();
    let CategoriaNube =$("#IdCategoria").val();
    let NombreNube =$("#NombreNube").val(); 
    
    // Creacion de la lista de datos para guardarla en la base de datos como propiedades de la instancia Nube.
    let DatosNube= 
    {
        id:idNube,
        brand:MarcaNube,
        model:ModeloNube,
        category_id:CategoriaNube,
        name:NombreNube
    };
    // Conversion de datos Json a String.
    let Datostosendns=JSON.stringify(DatosNube)  
    
    //LLamado AJAX para la peticion POST.
    $.ajax
    (
        { 
        url : 'https://g8bd4ed023d5ff8-basededatostic.adb.sa-saopaulo-1.oraclecloudapps.com/ords/admin/cloud/cloud',
        type : 'POST',
        data:Datostosendns,
        // Tipo de Contenido que va a recibir el backend
        contentType:'application/json',
            success : function(Nubes) 
            {
                // Instruccion para vaciar los campos de texto en el html.
                $("#IdNube").val("");
                $("#MarcaNube").val("");
                $("#ModeloNube").val("");
                $("#IdCategoria").val("");
                $("#NombreNube").val(""); 

            },
            error : function() 
            {
            alert('ha sucedido un problema');
            },
            complete : function() 
            {
            // LLamado de la funcion Leer Clientes para que se actualicen los datos de manera automatica.
            LeerNube();
            alert('Se guardo la nube');
            }
        }
    );
}

function EditarNube()
{
    // Creacion de las variables que se van a recibir desde el html.
    let idNube =$("#IdNube").val();
    let MarcaNube =$("#MarcaNube").val();
    let ModeloNube =$("#ModeloNube").val();
    let CategoriaNube =$("#IdCategoria").val();
    let NombreNube =$("#NombreNube").val(); 
    
    // Creacion de la lista de datos para guardarla en la base de datos como propiedades de la instancia Nube.
    let DatosNube= 
    {
        id:idNube,
        brand:MarcaNube,
        model:ModeloNube,
        category_id:CategoriaNube,
        name:NombreNube
    };
    // Conversion de datos Json a String.
    let Datostosendns=JSON.stringify(DatosNube)  
    
    //LLamado AJAX para la peticion PUT.
    $.ajax
    (
        { 
        url : 'https://g8bd4ed023d5ff8-basededatostic.adb.sa-saopaulo-1.oraclecloudapps.com/ords/admin/cloud/cloud',
        type : 'PUT',
        data:Datostosendns,
        // Tipo de Contenido que va a recibir el backend
        contentType:'application/json',
            success : function(Nubes) 
            {
                // Instruccion para vaciar los campos de texto en el html.
                $("#IdNube").val("");
                $("#MarcaNube").val("");
                $("#ModeloNube").val("");
                $("#IdCategoria").val("");
                $("#NombreNube").val(""); 

            },
            error : function() 
            {
            alert('ha sucedido un problema');
            },
            complete : function() 
            {
            // LLamado de la funcion Leer Clientes para que se actualicen los datos de manera automatica.
            LeerNube();
            alert('Se actualizo la nube');
            }
        }
    );
}
function BorrarNube(idNube)
{
    // Aqui solo recibo los datos del ID porque es lo que necesito para poder eliminar el registro.
    let DatosNube={id:idNube};

    let Datostosendns=JSON.stringify(DatosNube)  
    // LLamado Ajax del Delete.
    $.ajax
    (
        { 
        url : 'https://g8bd4ed023d5ff8-basededatostic.adb.sa-saopaulo-1.oraclecloudapps.com/ords/admin/cloud/cloud',
        type : 'DELETE',
        data:Datostosendns,
        contentType:'application/json',
            success : function(Nubes) 
            {
                $("#IdNube").val("");
                $("#MarcaNube").val("");
                $("#ModeloNube").val("");
                $("#IdCategoria").val("");
                $("#NombreNube").val(""); 
            },
            error : function() 
            {
            alert('ha sucedido un problema');
            },
            complete : function() 
            {
             // LLamado de la funcion Leer Clientes para que se actualicen los datos de manera automatica.
            LeerNube();
            alert('Se elimino la nube');
            }
        }
    );
}

