var map;
var labels = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
var labelIndex = 0;

function initMap() {
    $.ajax({
        url: 'http://localhost:8080/shops/all',
        dataType: 'application/json',
        complete: function(data){
            var features = JSON.parse(data.responseText);
            features.forEach(function(feature) {
                var marker = new google.maps.Marker({
                    position: new google.maps.LatLng(feature.location.x, feature.location.y),
                    label: labels[labelIndex++ % labels.length],
                    map: map
                });
                marker.addListener('click', function() {
                    getInfoWindow(feature).open(map, marker);
                });
                marker.setMap(map);
            });
        }
    });
    var myLatlng = new google.maps.LatLng(53.417, 14.544);
    var mapOptions = {
        zoom: 12,
        center: myLatlng,
        mapTypeControlOptions: {
            mapTypeIds: ['roadmap', 'satellite', 'hybrid', 'terrain',
                'styled_map']
        }
    };
    var map = new google.maps.Map(document.getElementById("map"), mapOptions);

    var geocoder = new google.maps.Geocoder();

    document.getElementById('submit').addEventListener('click', function() {
        geocodeAddress(geocoder, map);
    });

    function getInfoWindow(feature){
        var infowindow = new google.maps.InfoWindow({
            content: getContent(feature),
        });
        return infowindow;
    }

    /*[{
        "id": 1,
        "shopName": "lumpex1",
        "city": "Szczecin",
        "postCode": "78965",
        "street": "1111",
        "home": "Poland",
        "location": {"id": 1, "x": 23.789, "y": 89.098},
        "open": {
            "id": 1,
            "monday": 8.0,
            "tuesday": 8.0,
            "wednesday": 8.0,
            "thursday": 8.0,
            "friday": 8.0,
            "saturday": 8.0,
            "sunday": 8.0
        },
        "close": {
            "id": 1,
            "monday": 12.0,
            "tuesday": 21.0,
            "wednesday": 21.0,
            "thursday": 12.0,
            "friday": 12.0,
            "saturday": 12.0,
            "sunday": 21.0
        },
        "delivery": {
            "id": 1,
            "monday": false,
            "tuesday": false,
            "wednesday": false,
            "thursday": false,
            "friday": false,
            "saturday": false,
            "sunday": false
        },
        "price": {
            "id": 1,
            "monday": 12.0,
            "tuesday": 12.0,
            "wednesday": 12.0,
            "thursday": 12.0,
            "friday": 12.0,
            "saturday": 12.0,
            "sunday": 12.0
        }
    }];*/

    function getContent(feature) {
        return  '<div id="content">'+
            '<h1 id="firstHeading" class="firstHeading">'+feature.shopName+'</h1>'+
                    '<div id="topContent">'+
                        '<ul><span>Adres:</span>'+
                            '<li>'+feature.street+'</li>'+
                            '<li>'+feature.postCode+'</li>'+
                            '<li>'+feature.city+'</li>'+
                        '</ul>'+
                    '</div>'+
                    '<div id="bodyContent">'+
                        '<ul id="workTime"><span>Godziny otwarcia:</span>'+
                            '<li>'+" Poniedziałek: "+feature.open.monday+" - "+feature.close.monday+'</li>'+
                            '<li>'+" Wtorek: "+feature.open.thursday+" - "+feature.close.thursday+'</li>'+
                            '<li>'+" Środa: "+feature.open.wednesday+" - "+feature.close.wednesday+'</li>'+
                            '<li>'+" Czwartek: "+feature.open.thursday+" - "+feature.close.thursday+'</li>'+
                            '<li>'+" Piątek: "+feature.open.friday+" - "+feature.close.friday+'</li>'+
                            '<li>'+" Sobota: "+feature.open.saturday+" - "+feature.close.saturday+'</li>'+
                            '<li>'+" Niedziela: "+feature.open.sunday+" - "+feature.close.sunday+'</li>'+
                        '</ul>'+
                        '<ul id="priceOnDay"><span>Cena:</span>'+
                            '<li>'+" Poniedziałek: "+feature.price.monday+'</li>'+
                            '<li>'+" Wtorek: "+feature.price.thursday+'</li>'+
                            '<li>'+" Środa: "+feature.price.wednesday+'</li>'+
                            '<li>'+" Czwartek: "+feature.price.thursday+'</li>'+
                            '<li>'+" Piątek: "+feature.price.friday+'</li>'+
                            '<li>'+" Sobota: "+feature.price.saturday+'</li>'+
                            '<li>'+" Niedziela: "+feature.price.sunday+'</li>'+
                        '</ul>'+
                    '</div>'+
                '</div>';
    }

    function geocodeAddress(geocoder, resultsMap) {
        var address = document.getElementById('address').value;
        geocoder.geocode({'address': address}, function(results, status) {
            if (status === 'OK') {
                resultsMap.setCenter(results[0].geometry.location);
            } else {
                alert('Geocode was not successful for the following reason: ' + status);
            }
        });
    }
    var styledMapType = new google.maps.StyledMapType(
        [
            {elementType: 'geometry', stylers: [{color: '#ebe3cd'}]},
            {elementType: 'labels.text.fill', stylers: [{color: '#523735'}]},
            {elementType: 'labels.text.stroke', stylers: [{color: '#f5f1e6'}]},
            {
                featureType: 'administrative',
                elementType: 'geometry.stroke',
                stylers: [{color: '#c9b2a6'}]
            },
            {
                featureType: 'administrative.land_parcel',
                elementType: 'geometry.stroke',
                stylers: [{color: '#dcd2be'}]
            },
            {
                featureType: 'administrative.land_parcel',
                elementType: 'labels.text.fill',
                stylers: [{color: '#ae9e90'}]
            },
            {
                featureType: 'landscape.natural',
                elementType: 'geometry',
                stylers: [{color: '#dfd2ae'}]
            },
            {
                featureType: 'poi',
                elementType: 'geometry',
                stylers: [{color: '#dfd2ae'}]
            },
            {
                featureType: 'poi',
                elementType: 'labels.text.fill',
                stylers: [{color: '#93817c'}]
            },
            {
                featureType: 'poi.park',
                elementType: 'geometry.fill',
                stylers: [{color: '#a5b076'}]
            },
            {
                featureType: 'poi.park',
                elementType: 'labels.text.fill',
                stylers: [{color: '#447530'}]
            },
            {
                featureType: 'road',
                elementType: 'geometry',
                stylers: [{color: '#f5f1e6'}]
            },
            {
                featureType: 'road.arterial',
                elementType: 'geometry',
                stylers: [{color: '#fdfcf8'}]
            },
            {
                featureType: 'road.highway',
                elementType: 'geometry',
                stylers: [{color: '#f8c967'}]
            },
            {
                featureType: 'road.highway',
                elementType: 'geometry.stroke',
                stylers: [{color: '#e9bc62'}]
            },
            {
                featureType: 'road.highway.controlled_access',
                elementType: 'geometry',
                stylers: [{color: '#e98d58'}]
            },
            {
                featureType: 'road.highway.controlled_access',
                elementType: 'geometry.stroke',
                stylers: [{color: '#db8555'}]
            },
            {
                featureType: 'road.local',
                elementType: 'labels.text.fill',
                stylers: [{color: '#806b63'}]
            },
            {
                featureType: 'transit.line',
                elementType: 'geometry',
                stylers: [{color: '#dfd2ae'}]
            },
            {
                featureType: 'transit.line',
                elementType: 'labels.text.fill',
                stylers: [{color: '#8f7d77'}]
            },
            {
                featureType: 'transit.line',
                elementType: 'labels.text.stroke',
                stylers: [{color: '#ebe3cd'}]
            },
            {
                featureType: 'transit.station',
                elementType: 'geometry',
                stylers: [{color: '#dfd2ae'}]
            },
            {
                featureType: 'water',
                elementType: 'geometry.fill',
                stylers: [{color: '#b9d3c2'}]
            },
            {
                featureType: 'water',
                elementType: 'labels.text.fill',
                stylers: [{color: '#92998d'}]
            }
        ],
        {name: 'Styled Map'});
    map.mapTypes.set('styled_map', styledMapType);
    map.setMapTypeId('styled_map');
}