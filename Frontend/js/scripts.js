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

function hideATag(idElement) {
    var element = document.getElementById(idElement);
    element.style.visibility = "hidden";
}

function showATag(idElement) {
    var element = document.getElementById(idElement);
    element.style.visibility = "visible";
}

function showAlert(msg) {

    document.getElementById("alertas").innerHTML = msg;
    showATag("alertas");
    setTimeout(function() {
        document.getElementById("alertas").innerHTML = "";
    }, 2000);

}

hideATag("table-listar");
hideATag("alertas")

document.getElementById("salvar-nova-tarefa").onclick = function() {


    var alertaCriar = `
    <div class="alert alert-success" role="alert">
        Tarefa criada com sucesso.
    </div>
    `;

    var titulo = document.getElementById("criar-titulo").value;
    var descricao = document.getElementById("criar-desc").value;
    var dataLimite = document.getElementById("criar-data").value;
    var prioridade = document.getElementById("criar-prioridade").value;
    var categoria = document.getElementById("criar-cat").value;
    var status = document.getElementById("criar-status").value;

    tarefa = `{"titulo": "${titulo}", "descricao": "${descricao}", "dataLimite": "${dataLimite}", "prioridade": "${prioridade}", "categoria": "${categoria}", "status": "${status}"}`;
    tarefaJSON = JSON.parse(tarefa);
    tarefas.push(tarefaJSON);

    $("#modal-criar-tarefa").modal("hide");

    showAlert(alertaCriar);
}


document.getElementById("listar-tarefas-status").onclick = function() {

    showATag("table-listar");

    let status = document.getElementById("listar-status").value;
    var divListar = document.getElementById("body-tabela-listar").innerHTML;
    divListar = "";

    for (let task of tarefas) {
        if (task.status == status) {
            divListar += `
            <tr>
                <th scope="row">${task.titulo}</th>
                <td>${task.descricao}</td>
                <td>${task.prioridade}</td>
                <td>${task.status}</td>
                <td>${task.dataLimite}</td>
                <td>${task.categoria}</td>
            </tr>
            `
        } else if (status == status) {
            divListar += `
            <tr>
                <th scope="row">${task.titulo}</th>
                <td>${task.descricao}</td>
                <td>${task.prioridade}</td>
                <td>${task.status}</td>
                <td>${task.dataLimite}</td>
                <td>${task.categoria}</td>
            </tr>
            `
        } else if (status == status) {
            divListar += `
            <tr>
                <th scope="row">${task.titulo}</th>
                <td>${task.descricao}</td>
                <td>${task.prioridade}</td>
                <td>${task.status}</td>
                <td>${task.dataLimite}</td>
                <td>${task.categoria}</td>
            </tr>
            `
        } else {
            divListar += `
            <tr>
                <th scope="row">${task.titulo}</th>
                <td>${task.descricao}</td>
                <td>${task.prioridade}</td>
                <td>${task.status}</td>
                <td>${task.dataLimite}</td>
                <td>${task.categoria}</td>
            </tr>
            `
        }
    }
    document.getElementById("body-tabela-listar").innerHTML = divListar;
}

document.getElementById("update-tarefa").onclick = function() {

    var tituloTarefaParaAtualizar = document.getElementById("titulo-atualizar").value;
    console.log(tituloTarefaParaAtualizar);
    var alertaUpdate = "";

    for (let task of tarefas) {
        console.log(task);
        if (tituloTarefaParaAtualizar == task.titulo) {
            var titulo = tituloTarefaParaAtualizar;
            var descricao = document.getElementById("atualizar-desc").value;
            var dataLimite = document.getElementById("atualizar-data").value;
            var prioridade = document.getElementById("atualizar-prioridade").value;
            var categoria = document.getElementById("atualizar-cat").value;
            var status = document.getElementById("atualizar-status").value;
            tarefa = `{"titulo": "${titulo}", "descricao": "${descricao}", "dataLimite": "${dataLimite}", "prioridade": "${prioridade}", "categoria": "${categoria}", "status": "${status}"}`;
            tarefaJSON = JSON.parse(tarefa);
            tarefas.push(tarefaJSON);

            alertaUpdate = `
            <div class="alert alert-success" role="alert">
                Tarefa atualizada com sucesso.
            </div>
            `
            setInterval(showAlert(alertaUpdate), 2000);

            break;
        } else {
            alertaUpdate = `
            <div class="alert alert-danger" role="alert">
                Essa tarefa não está cadastrada.
            </div>
            `
            setInterval(showAlert(alertaUpdate), 2000);
        }
    }

    $("#modal-atualizar-tarefa").modal("hide");
}

document.getElementById("apagar-tarefa").onclick = function() {

    var tarefaApagada = document.getElementById("apagar-tarefa-titulo").value;
    var apagar;
    var alertaDeletar = "";

    for (let task of tarefas) {
        console.log(task.titulo);
        if (task.titulo == tarefaApagada) {
            apagar = true;
            break;
        }
    }

    if (apagar) {
        tarefas = tarefas.filter((item) => item.titulo !== tarefaApagada);
        alertaDeletar = `
        <div class="alert alert-success" role="alert">
            Tarefa apagada com sucesso.
        </div>
        `
        setInterval(showAlert(alertaDeletar), 2000);
    } else {
        alertaDeletar = `
        <div class="alert alert-danger" role="alert">
            Essa tarefa não está cadastrada.
        </div>
        `
        setInterval(showAlert(alertaDeletar), 2000);
    }

    $("#modal-deletar-tarefa").modal("hide");
}