/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function validarForma(forma){
    var usuario = forma.usuario;
    if(usuario.valueOf == "" || usuario.value == "Escribir usuario"){
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    
    var password = forma.password;
    if (password.value == "" || password.value.length < 3){
        alert("Debe proporcionar un password a menos de 3 caracteres");
        password.focus();
        password.select();
        return false;
    }
    
    var tecnologias = forma.tecnologia;
    var checkSeleccionado = false;
    
    for(var i=0 ; i<tecnologias.length ; i++){

        if(tecnologias[i].checked){
            checkSeleccionado = true;
        }
    }
    
    if(!checkSeleccionado){
        alert("Debe seleccionar una tecnologia");
        return false
    }
    
    var generos = forma.genero;
    var radioSeleccionado = false;
    
    for(var i = 0; i < generos.length; i++){
        if(generos[i].checked){
            radioSeleccionado = true;
        }
    }
    
    if(!radioSeleccionado){
        alert("Debe selecciona un genero");
        return false;
    }
    
    var ocupacion = forma.ocupacion;
    if(ocupacion.value== ""){
        alert("Debe seleccionar una ocupacion");
        return false;
    }
    
    //formulario es valido
    alert("Formulario es valido ... enviando datos al servidor");
    return true;
}
