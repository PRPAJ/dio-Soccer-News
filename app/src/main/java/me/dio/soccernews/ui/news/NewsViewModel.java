package me.dio.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import me.dio.soccernews.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();
        //TODO remover mock de notícias
        List<News> news = new ArrayList<>();
        news.add(new News("Ferroviária Tem Desfalque Importante",""));
        news.add(new News("Ferrinha Joga No Sábado",""));
        news.add(new News("Copa Do Mundo Está Terminando",""));
        this.news.setValue(news);

    }

    public LiveData<List<News>> getNews() {

        return this.news;
    }
}