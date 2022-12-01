// Nota: Para llamar las variables o botones desde el html usamos el numeral antes de la variable.

function LeerCliente()
{
    //Llamado AJAX
    $.ajax
    (
        { 
        //Url de la base de datos.
        url : 'https://g8bd4ed023d5ff8-basededatostic.adb.sa-saopaulo-1.oraclecloudapps.com/ords/admin/client/client',
        //Tipo de peticion que vamos a usar en este caso GET.
        type : 'GET',
        //Tipo de dato que acepta el ajax, en este caso JSON.
        dataType : 'json',
            //Que va a hacer si los datos que recibe son correctos
            success : function(Clientes) 
            {
                //Creacion de los items de la instancia clientes
                let cs=Clientes.items;
                //Instruccion para vaciar los campos de la lista de clientes
                $("#ListaClientes").empty();
                //Ciclo para recorrer todas las instancias de la base de datos.
                for(i=0;i<cs.length;i++)
                {
                    //Instruccion para agregar en la pagina web la informacion del div en este caso
                    //El ID, el nombre y el email.
                    $("#ListaClientes").append("<b>" + cs[i].id + "</b> " + "<b>"+cs[i].name + "</b> "
                    + "<b>" + cs[i].email +"</b> " + "<b>" + cs[i].age + "</b>");
                    //Instruccion para crear los botones de borrar justo al lado de la informacion del cliente.
                    $("#ListaClientes").append(" <button onclick='BorrarCliente("+cs[i].id+")'>Borrar</button><br>");
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
            alert('Se muestran los clientes');
            }
        }
    );
}

function GuardarCliente()
{
    // Creacion de las variables que se van a recibir desde el html.
    let idClient =$("#IdCliente").val();
    let NombreClient =$("#NombreCliente").val();
    let CorreoClient =$("#CorreoCliente").val();
    let EdadClient =$("#EdadCliente").val();
    
    // Creacion de la lista de datos para guardarla en la base de datos.
    let Datos= 
    {
        id:idClient,
        name:NombreClient,
        email:CorreoClient,
        age:EdadClient
    };
    // Conversion de datos Json a String.
    let Datostosend=JSON.stringify(Datos)  
    
    //LLamado AJAX para la peticion POST.
    $.ajax
    (
        { 
        url : 'https://g8bd4ed023d5ff8-basededatostic.adb.sa-saopaulo-1.oraclecloudapps.com/ords/admin/client/client',
        type : 'POST',
        data:Datostosend,
        // Tipo de Contenido que va a recibir el backend
        contentType:'application/json',
            success : function(Clientes) 
            {
                // Instruccion para vaciar los campos de texto en el html.
                $("#IdCliente").val("");
                $("#NombreCliente").val("");
                $("#CorreoCliente").val("");
                $("#EdadCliente").val("");
            },
            error : function() 
            {
            alert('ha sucedido un problema');
            },
            complete : function() 
            {
            // LLamado de la funcion Leer Clientes para que se actualicen los datos de manera automatica.
            LeerClientes();
            alert('Se guardo el cliente');
            }
        }
    );
}

function EditarCliente()
{
    // Creacion de las variables que se van a recibir desde el html.
    let idClient =$("#IdCliente").val();
    let NombreClient =$("#NombreCliente").val();
    let CorreoClient =$("#CorreoCliente").val();
    let EdadClient =$("#EdadCliente").val();
    // Creacion de la lista de datos para guardarla en la base de datos.
    let Datos= 
    {
        id:idClient,
        name:NombreClient,
        email:CorreoClient,
        age:EdadClient
    };
    // Conversion de datos Json a String.
    let Datostosend=JSON.stringify(Datos)  
    
    //LLamado AJAX para la peticion PUT.
    $.ajax
    (
        { 
        url : 'https://g8bd4ed023d5ff8-basededatostic.adb.sa-saopaulo-1.oraclecloudapps.com/ords/admin/client/client',
        type : 'PUT',
        data:Datostosend,
        contentType:'application/json',
            success : function(Clientes) 
            {   
                // Instruccion para vaciar los campos de texto en el html.
                $("#IdCliente").val("");
                $("#NombreCliente").val("");
                $("#CorreoCliente").val("");
                $("#EdadCliente").val("");
            },
            error : function() 
            {
            alert('ha sucedido un problema');
            },
            complete : function() 
            {
            // LLamado de la funcion Leer Clientes para que se actualicen los datos de manera automatica.
            LeerClientes();
            alert('Se actualizo el cliente');
            }
        }
    );   
}

function BorrarCliente(idClient)
{
    // Aqui solo recibo los datos del ID porque es lo que necesito para poder eliminar el registro.
    let Datos={id:idClient};

    let Datostosend=JSON.stringify(Datos)  
    // LLamado Ajax del Delete.
    $.ajax
    (
        { 
        url : 'https://g8bd4ed023d5ff8-basededatostic.adb.sa-saopaulo-1.oraclecloudapps.com/ords/admin/client/client',
        type : 'DELETE',
        data:Datostosend,
        contentType:'application/json',
            success : function(Clientes) 
            {
                $("#IdCliente").val("");
                $("#NombreCliente").val("");
                $("#CorreoCliente").val("");
                $("#EdadCliente").val("");

            },
            error : function() 
            {
            alert('ha sucedido un problema');
            },
            complete : function() 
            {
             // LLamado de la funcion Leer Clientes para que se actualicen los datos de manera automatica.
            LeerClientes();
            alert('Se elimino el cliente');
            }
        }
    );
}

