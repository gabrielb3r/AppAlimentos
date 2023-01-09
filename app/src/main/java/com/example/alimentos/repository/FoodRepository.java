package com.example.alimentos.repository;

import com.example.alimentos.entity.FoodEntity;

import java.util.ArrayList;
import java.util.List;

public class FoodRepository {

    private List<FoodEntity> mListFood;

    public FoodRepository() {
        this.mListFood = new ArrayList<>();

        //Adiciona itens
        this.mListFood.add(new FoodEntity(0, "Alface crespa", 8));
        this.mListFood.add(new FoodEntity(1, "Azeite", 90));
        this.mListFood.add(new FoodEntity(2, "Batata Doce", 115));
        this.mListFood.add(new FoodEntity(3, "Ervilhas Cruas", 81));
        this.mListFood.add(new FoodEntity(4, "Feijão Carioca", 77));
        this.mListFood.add(new FoodEntity(5, "Filé de frango frito", 240));
        this.mListFood.add(new FoodEntity(6, "Grão de Bico", 720));
        this.mListFood.add(new FoodEntity(7, "Macarrão Cozido", 221));
        this.mListFood.add(new FoodEntity(8, "Pão de Forma 12 Grãos", 110));
        this.mListFood.add(new FoodEntity(9, "Queijo Parmesão", 18));
        this.mListFood.add(new FoodEntity(10, "Rúcula", 5));
        this.mListFood.add(new FoodEntity(11, "Vagem Cozida", 44));
        this.mListFood.add(new FoodEntity(12, "Vodka", 231));
        this.mListFood.add(new FoodEntity(13, "Whiskey", 58));
    }

    public FoodEntity get(int id) {
        return this.mListFood.get(id);
    }

    public List<FoodEntity> getList() {
        return this.mListFood;
    }
}
