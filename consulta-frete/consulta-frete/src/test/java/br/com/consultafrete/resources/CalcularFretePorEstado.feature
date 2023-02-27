Feature: Calcular frete por estado

  Scenario Outline: Calcular frete por estado
    Given um estado <uf>
    When calcular o frete
    Then o valor do frete deve ser <valor>

    Examples:
      | uf  | valor  |
      | SP  | 7.85   |
      | RJ  | 7.85   |
      | MG  | 7.85   |
      | ES  | 7.85   |
      | MS  | 12.50  |
      | MT  | 12.50  |
      | GO  | 12.50  |
      | DF  | 12.50  |
      | BA  | 15.98  |
      | SE  | 15.98  |
      | AL  | 15.98  |
      | PE  | 15.98  |
      | PB  | 15.98  |
      | RN  | 15.98  |
      | CE  | 15.98  |
      | PI  | 15.98  |
      | MA  | 15.98  |
      | RS  | 17.30  |
      | PR  | 17.30  |
      | SC  | 17.30  |
      | AC  | 20.83  |
      | AP  | 20.83  |
      | AM  | 20.83  |
      | PA  | 20.83  |
      | RO  | 20.83  |
      | RR  | 20.83  |
      | TO  | 20.83  |

