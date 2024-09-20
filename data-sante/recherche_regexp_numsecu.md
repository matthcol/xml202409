# Expression Régulière
Website de test: https://regex101.com/

## Regexp/pattern pour numéro de sécurité sociale en France
```
[12][0-9]{2}(0[1-9]|1[0-2])(0[1-9]|[13-9][0-9]|2[AB1-9])[0-9]{6}
```

### Détail
Département (NB: des espaces sont ajoutés pour la lisibilité)
```
( 0[1-9] | [13-9][0-9] | 2[AB1-9] )
```

- soit le département commence par 0 et est suivi d'1 chiffre de 1 à 9
- soit le département commence par 1, 3, 4, 5, 6, 7, 8, 9 et est suivi d'1 chiffre de 0 à 9
- soit le département commence par 2 et est suivi d'1 chiffre de 1 à 9 ou les lettres A ou B


## Exemples de numéro correct
- 1901243123456
- 190122A123456
- 290122B123456
- 2901221123456

## Exemples de numéro incorrect
- 290122B12345
- 990122B123456
- 290132B123456
- 2901220123456