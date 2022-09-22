package Web2.kurlyclone.api.goods;

import Web2.kurlyclone.goods.Goods;
import Web2.kurlyclone.goods.GoodsRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class GoodsService {

    private final GoodsRepo goodsRepo;

    public Goods findOne(Long oid) {
        return goodsRepo.findByOid(oid).orElse(null);
    }
}