# StreamForge Content Service

The Content Service is the **movie catalog service** of the StreamForge video-on-demand platform.

It acts as the central source of information about the content available on StreamForge. 
The service stores and manages movie metadata such as title, description, thumbnail, cast, 
genre, release information, and other content-related details.

## Responsibilities

The Content Service is responsible for:

- Managing movie and content metadata
- Storing movie titles and descriptions
- Managing movie thumbnails/posters
- Managing cast information
- Managing genres and categories
- Storing other movie-related metadata
- Providing REST APIs for retrieving and managing content
- Providing content information to other StreamForge services

## Content Information

A movie can contain information such as:

- Title
- Description
- Thumbnail / Poster
- Cast
- Genre
- Release date
- Duration
- Language
- Rating
- Content status

## Architecture

The Content Service is one of the independent microservices in StreamForge.

```text
                    StreamForge
                         |
          +--------------+--------------+
          |              |              |
   Content Service  Video Service  Streaming Service
          |
     Movie Catalog
          |
   +------+------+
   |             |
Movie Metadata  Genres
   |
Title
Description
Thumbnail
Cast
etc.