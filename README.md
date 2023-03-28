# solid-alura
> Projeto referente ao curso de SOLID com Java da Alura.

Neste projeto aprendi sobre os conceitos de **SOLID** aplicando em um projeto Java

- S -> Princípio da Responsabilidade Única (Single Responsibility Principle - SRP): uma classe deve ter apenas uma razão para mudar. Isso significa que cada classe deve ter uma única responsabilidade bem definida e deve estar focada em cumprir essa responsabilidade. Se uma classe tem várias responsabilidades, ela se torna mais difícil de entender, testar e modificar.

- O -> Princípio Aberto-Fechado (Open-Closed Principle - OCP): entidades de software (classes, módulos, funções etc.) devem ser abertas para extensão, mas fechadas para modificação. Isso significa que você deve poder adicionar novos recursos ao software sem precisar alterar o código existente. Para fazer isso, você pode usar herança, composição ou padrões de design como o padrão Strategy.

- L -> Princípio de Substituição de Liskov (Liskov Substitution Principle - LSP): uma classe derivada deve ser substituível por sua classe base. Isso significa que você deve ser capaz de usar um objeto de uma classe derivada em qualquer lugar que você esperaria um objeto da classe base, sem quebrar o comportamento do programa. Para seguir este princípio, a classe derivada não deve alterar o comportamento dos métodos da classe base.

- I -> Princípio da Segregação de Interface (Interface Segregation Principle - ISP): as interfaces devem ser segregadas para que os clientes não precisem depender de métodos que não usam. Isso significa que você deve criar interfaces que sejam específicas para as necessidades de cada cliente, em vez de ter uma única interface com muitos métodos. Isso ajuda a evitar a criação de classes muito grandes e complexas, que são difíceis de entender e manter.

- D -> Princípio da Inversão de Dependência (Dependency Inversion Principle - DIP): os módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender de abstrações. Além disso, as abstrações não devem depender de detalhes, mas os detalhes devem depender das abstrações. Isso significa que você deve usar interfaces e classes abstratas para definir dependências em vez de classes concretas. Isso torna o software mais flexível e fácil de modificar, porque você pode trocar facilmente uma implementação por outra, desde que mantenha a mesma interface.
