// Nota: Para llamar las variables o botones desde el html usamos el numeral antes de la variable.

function LeerMensajes()
{
    //Llamado AJAX
    $.ajax
    (
        { 
        //Url de la base de datos.
        url : 'https://g8bd4ed023d5ff8-basededatostic.adb.sa-saopaulo-1.oraclecloudapps.com/ords/admin/message/message',
        //Tipo de peticion que vamos a usar en este caso GET.
        type : 'GET',
        //Tipo de dato que acepta el ajax, en este caso JSON.
        dataType : 'json',
            //Que va a hacer si los datos que recibe son correctos
            success : function(Mensajes) 
            {
                //Creacion de los items de la instancia clientes
                let ms=Mensajes.items;
                //Instruccion para vaciar los campos de la lista de clientes
                $("#ListaMensajes").empty();
                //Ciclo para recorrer todas las instancias de la base de datos.
                for(i=0;i<ms.length;i++)
                {
                    //Instruccion para agregar en la pagina web la informacion del div en este caso
                    //El ID, el nombre y el email.
                    $("#ListaMensajes").append("<b>"+ms[i].id+"</b> "+ ms[i].messagetext);
                    //Instruccion para crear los botones de borrar justo al lado de la informacion del cliente.
                    $("#ListaMensajes").append(" <button onclick='BorrarMensaje("+ms[i].id+")'>Borrar</button><br>");
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
            alert('Se muestran los mensajes');
            }
        }
    );
}

function GuardarMensaje()
{
    // Creacion de las variables que se van a recibir desde el html.
    let idMensaje =$("#IdMensaje").val();
    let TextoMensaje =$("#TextoMensaje").val();
    
    // Creacion de la lista de datos para guardarla en la base de datos.
    let DatosMensaje= 
    {
    id:idMensaje,
    messagetext:TextoMensaje
    };
    // Conversion de datos Json a String.
    let Datostosendms=JSON.stringify(DatosMensaje)  
    
    //LLamado AJAX para la peticion POST.
    $.ajax
    (
        { 
        url : 'https://g8bd4ed023d5ff8-basededatostic.adb.sa-saopaulo-1.oraclecloudapps.com/ords/admin/message/message',
        type : 'POST',
        data:Datostosendms,
        // Tipo de Contenido que va a recibir el backend
        contentType:'application/json',
            success : function(Mensajes) 
            {
                // Instruccion para vaciar los campos de texto en el html.
                $("#IdMensaje").val("");
                $("#TextoMensaje").val("");
            },
            error : function() 
            {
            alert('ha sucedido un problema');
            },
            complete : function() 
            {
            // LLamado de la funcion Leer Clientes para que se actualicen los datos de manera automatica.
            LeerMensajes();
            alert('Se guardo el Mensaje');
            }
        }
    );
}

function EditarMensaje()
{
    // Creacion de las variables que se van a recibir desde el html.
    let idMensaje =$("#IdMensaje").val();
    let TextoMensaje =$("#TextoMensaje").val();
    
    // Creacion de la lista de datos para guardarla en la base de datos.
    let DatosMensaje= {id:idMensaje,messagetext:TextoMensaje};
    // Conversion de datos Json a String.
    let Datostosendms=JSON.stringify(DatosMensaje)  
    
    //LLamado AJAX para la peticion POST.
    $.ajax
    (
        { 
        url : 'https://g8bd4ed023d5ff8-basededatostic.adb.sa-saopaulo-1.oraclecloudapps.com/ords/admin/message/message',
        type : 'PUT',
        data:Datostosendms,
        // Tipo de Contenido que va a recibir el backend
        contentType:'application/json',
            success : function(Mensajes) 
            {
                // Instruccion para vaciar los campos de texto en el html.
                $("#IdMensaje").val("");
                $("#TextoMensaje").val("");
            },
            error : function() 
            {
            alert('ha sucedido un problema');
            },
            complete : function() 
            {
            // LLamado de la funcion Leer Clientes para que se actualicen los datos de manera automatica.
            LeerMensajes();
            alert('Se actualizo el Mensaje');
            }
        }
    );
}

function BorrarMensaje(idMensaje)
{
    // Aqui solo recibo los datos del ID porque es lo que necesito para poder eliminar el registro.
    let DatosMensaje={id:idMensaje};

    let Datostosendms=JSON.stringify(DatosMensaje)  
    // LLamado Ajax del Delete.
    $.ajax
    (
        { 
        url : 'https://g8bd4ed023d5ff8-basededatostic.adb.sa-saopaulo-1.oraclecloudapps.com/ords/admin/message/message',
        type : 'DELETE',
        data:Datostosendms,
        contentType:'application/json',
            success : function(Mensajes) 
            {
                $("#IdMensaje").val("");
                $("#TextoMensaje").val("");
            },
            error : function() 
            {
            alert('ha sucedido un problema');
            },
            complete : function() 
            {
            // LLamado de la funcion Leer Clientes para que se actualicen los datos de manera automatica.
            LeerMensajes();
            alert('Se elimino el mensaje');
            }
        }
    );
}