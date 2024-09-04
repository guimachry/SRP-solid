using System;

namespace Lab.Principles.Solid
{

    public class Livro
    {
        public string Nome { get; set; }
        public string Autor { get; set; }
        public string Texto { get; set; }

        public string SubstituirPalavraNoTexto(string palavra, string substituicao)
        {
            return Texto.Replace(palavra, substituicao);
        }

        public bool PalavraEstáNoTexto(string palavra)
        {
            return Texto.Contains(palavra);
        }
    }


    public class ImpressoraDeLivro
    {
        public void ImprimirTextoNoConsole(Livro livro)
        {
            Console.WriteLine($"Nome do livro: {livro.Nome}");
            Console.WriteLine($"Texto: {livro.Texto}");
        }

        public void ImprimirTextoEmOutroMeio(string texto)
        {
          
            Console.WriteLine($"{texto}");
        }
    }

}