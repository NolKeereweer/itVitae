package com.wrk.secondtestprogram;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping ("api/v1/items")
public class SecondTestProgramController {
  @GetMapping("{id}")
  public SmallItem getById(@PathVariable long id) {
    return localItems.get((int) id);
  }

  @GetMapping
  public List<SmallItem> getItems() {
    return localItems;
  }
  record SmallItem(String name) {}

  private ArrayList<SmallItem> localItems = new ArrayList<>();

  @PostMapping
  public ResponseEntity<Void> postItem(@RequestBody SmallItem item, UriComponentsBuilder ucb)  {
    localItems.add(item);
    URI locationOfNewItem = ucb
            .path("api/v1/items/{id}")
            .buildAndExpand(localItems.size() - 1)
            .toUri();

    return ResponseEntity.created(locationOfNewItem).build();
  }

  @DeleteMapping("{index}")
  public ResponseEntity<Void> deleteItem(@PathVariable long index) {
    localItems.remove((int)index);

    return ResponseEntity.noContent().build();
  }

  @PutMapping("{index}")
  public ResponseEntity<Void> replaceItem(@RequestBody SmallItem newContents, @PathVariable long index) {
    localItems.set((int)index, newContents);

    return ResponseEntity.noContent().build();
  }
}