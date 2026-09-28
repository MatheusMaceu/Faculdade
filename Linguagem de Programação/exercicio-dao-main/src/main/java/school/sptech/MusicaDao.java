package school.sptech;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class MusicaDao {

    private final JdbcTemplate jdbcTemplate;

    public MusicaDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /* Escreva os métodos abaixo */

    public List<Musica> findAll() {
        List<Musica> lista = jdbcTemplate.query("SELECT * FROM musica", new BeanPropertyRowMapper<>(Musica.class));
        return lista;
    }

    public Musica findById(Integer id){
        List<Musica> musica = jdbcTemplate.query("SELECT * FROM musica WHERE id = ?", new BeanPropertyRowMapper<>(Musica.class),id);
        if (musica.isEmpty()){
            return null;
        }
        return musica.get(0);
    }

    public List<Musica> findByNomeLike(String nome){
        return jdbcTemplate.query("SELECT * FROM musica WHERE LOWER(nome) LIKE LOWER(?)", new BeanPropertyRowMapper<>(Musica.class),"%"+nome+"%");
    }

    public List<Musica> findByArtista(String artista){
        return jdbcTemplate.query("SELECT * FROM musica WHERE artista = ?", new BeanPropertyRowMapper<>(Musica.class),artista);
    }

    public List<Musica> findByAlbum(String album){
        return jdbcTemplate.query("SELECT * FROM musica WHERE album = ?", new BeanPropertyRowMapper<>(Musica.class),album);
    }

    public List<Musica> findByDuracaoGreaterThan(Integer duracao){
        return jdbcTemplate.query("SELECT * FROM musica WHERE duracao > ?", new BeanPropertyRowMapper<>(Musica.class),duracao);
    }

    public List<Musica> findByAlbumAndNomeLike(String album, String nome){
        return jdbcTemplate.query("SELECT * FROM musica WHERE album = ? AND LOWER(nome) LIKE LOWER(?)", new BeanPropertyRowMapper<>(Musica.class),album, "%"+nome+"%");
    }

    public void save (Musica musica){
        if (musica.getId() == null){
            jdbcTemplate.update("INSERT INTO musica(nome,artista,album,duracao) VALUES (?,?,?,?)", musica.getNome(), musica.getArtista(), musica.getAlbum(), musica.getDuracao());
        }else{
            jdbcTemplate.update("UPDATE musica SET nome = ?, artista = ?, album = ?, duracao = ? WHERE id = ?", musica.getNome(), musica.getArtista(), musica.getAlbum(), musica.getDuracao(),musica.getId());
        }
    }

    public void deleteById(Integer id){
        jdbcTemplate.update("DELETE FROM musica WHERE id = ?",id);
    }
}
