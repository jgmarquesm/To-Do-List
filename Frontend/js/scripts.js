document.getElementById("home").onclick = function() {
    location.href = "#";
};

document.getElementById("criar-tarefa").onclick = function() {
    $("#modal-criar-tarefa").modal("show");
}

document.getElementById("listar-tarefas").onclick = function() {
    $("#modal-listar-tarefas").modal("show");
}

document.getElementById("atualizar-tarefa").onclick = function() {
    $("#modal-atualizar-tarefa").modal("show");
}

document.getElementById("deletar-tarefa").onclick = function() {
    $("#modal-deletar-tarefa").modal("show");
}

var tarefas = [];
var tarefa;

document.getElementById("salvar-nova-tarefa").onclick = function() {

    var titulo = document.getElementById("criar-titulo").value;
    var descricao = document.getElementById("criar-desc").value;
    var dataLimite = document.getElementById("criar-data").value;
    var prioridade = document.getElementById("criar-prioridade").value;
    var categoria = document.getElementById("criar-cat").value;
    var status = document.getElementById("criar-status").value;

    tarefa = `{"titulo": "${titulo}", "descricao": "${descricao}", "dataLimite": "${dataLimite}", "prioridade": "${prioridade}", "categoria": "${categoria}", "status": "${status}"}`;
    tarefaJSON = JSON.parse(tarefa);
    tarefas.push(tarefaJSON);
}


function hideATag(idElement) {
    var element = document.getElementById(idElement);
    element.style.visibility = "hidden";;
}

function showATag(idElement) {
    var element = document.getElementById(idElement);
    element.style.visibility = "visible";
}

hideATag("table-listar");

document.getElementById("listar-status").onchange = function() {

    showATag("table-listar");
    console.log(tarefas);

    let status = document.getElementById("listar-status").value;
    var divListar = document.getElementById("body-tabela-listar").innerHTML;
    divListar = "";

    if (status == "todo") {
        alert("Oops! Estamos trabalhando nisso ainda.")
    } else if (status == "doing") {
        alert("Oops! Estamos trabalhando nisso ainda.")
    } else if (status == "done") {
        alert("Oops! Estamos trabalhando nisso ainda.")
    } else {

        for (let i = 0; i < tarefas.length; i++) {
            divListar += `
        <tr>
            <th scope="row">${tarefas[i].titulo}</th>
            <td>${tarefas[i].descricao}</td>
            <td>${tarefas[i].prioridade}</td>
            <td>${tarefas[i].status}</td>
            <td>${tarefas[i].dataLimite}</td>
            <td>${tarefas[i].categoria}</td>
        </tr>
        `
        }
    }
    document.getElementById("body-tabela-listar").innerHTML = divListar;
}

document.getElementById("apagar-tarefa").onclick = function() {

    var tarefaApagada = document.getElementById("apagar-tarefa-titulo").value;
    var apagar;


    for (let task of tarefas) {
        console.log(task.titulo);
        if (task.titulo == tarefaApagada) {
            apagar = true;
            break;
        }
    }

    if (apagar) {
        tarefas = tarefas.filter((item) => item.titulo !== tarefaApagada);
    } else {
        alert("Verifque a lista de tarefas!");
    }
}