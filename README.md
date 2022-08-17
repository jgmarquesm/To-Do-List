<h2>ToDo List</h2>
<h4> Foi implementado o CRD de tasks na lista de tarefa.</h4>
<p>Ao executar o App, uma janela do JOptionPane se abre mostrando
as opções:</p>

- Cadastrar nova tarefa.

- Listar tarefas já existentes:
    - Listar por prioidade (de 1 a 5);
    - Listar por categoria;
    - Listar por status;
    - Voltar;

- Deletar tarefa existente.
- Sair.

<p>São feitas algumas validações para que uma entrada inválida
do usuário não afete o funcionamento do App.
Para persistencia das tasks, elas são salvas no formato .txt 
e o conteúdo é salvo estilo JSON (para facilitar as futuras 
implementações):

`[{"titulo":""},{"descricao":""},{"dataLimite":""},{"prioridade":""},{"categoria":""},{"status":""}]`
</p>

<h6>Vídeo de demonstração: <a href="https://www.linkedin.com/posts/jgmarquesm_acelerazg-versionamento-caejdigo-activity-6964988342270603264-B3LF?utm_source=linkedin_share&utm_medium=member_desktop_web" target="_blank">clique aqui</a>.</h6>

