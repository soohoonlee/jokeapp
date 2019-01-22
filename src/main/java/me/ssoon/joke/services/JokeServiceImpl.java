package me.ssoon.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

  private final ChuckNorrisQuotes chuckNorrisQuotes;

  public JokeServiceImpl(final ChuckNorrisQuotes chuckNorrisQuotes) {
    this.chuckNorrisQuotes = chuckNorrisQuotes;
  }

  @Override
  public String getJoke() {
    return chuckNorrisQuotes.getRandomQuote();
  }
}
