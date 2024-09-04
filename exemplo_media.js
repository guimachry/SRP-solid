class Avaliacoes {
    constructor(trabalho, prova, participacao){
        this.trabalho = trabalho;
        this.prova = prova;
        this.participacao = participacao;
    }
}

class Desempenho {
    constructor(avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    get media() {
        const { trabalho, prova, participacao } = this.avaliacoes;
        return parseInt((trabalho + prova + participacao) / 3);
    }
}