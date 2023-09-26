package br.com.victor.dao;

public class ContratoDao implements IContratoDao {

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não salvo no banco");
    }
    @Override
    public void buscar() {
        throw new UnsupportedOperationException("Não busca no banco");
    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Não exclui no banco");
    }

    @Override
    public void atualizar() {
        throw new UnsupportedOperationException("Não atualiza no banco");
    }
}
